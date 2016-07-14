package com.pigatron.finance.data.entity;


import java.util.Date;
import java.util.List;

public class HistoricRangeData {

    private Date startDate;
    private Date endDate;
    private List<HistoricDayData> dayData;

    private HistoricRangeData(Builder builder) {
        setStartDate(builder.startDate);
        setEndDate(builder.endDate);
        setDayData(builder.dayData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<HistoricDayData> getDayData() {
        return dayData;
    }

    public void setDayData(List<HistoricDayData> dayData) {
        this.dayData = dayData;
    }


    @Override
    public String toString() {
        return "HistoricRangeData{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", dayData=" + dayData +
                '}';
    }

    public static final class Builder {
        private Date startDate;
        private Date endDate;
        private List<HistoricDayData> dayData;

        private Builder() {
        }

        public Builder withStartDate(Date val) {
            startDate = val;
            return this;
        }

        public Builder withEndDate(Date val) {
            endDate = val;
            return this;
        }

        public Builder withDayData(List<HistoricDayData> val) {
            dayData = val;
            return this;
        }

        public HistoricRangeData build() {
            return new HistoricRangeData(this);
        }
    }
}
