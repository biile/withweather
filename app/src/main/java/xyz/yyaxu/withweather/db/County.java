package xyz.yyaxu.withweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    public int id;//每一个实体类都需有一个id
    public String countyName; //记录区县名称
    public int countyCode;//记录区县代码
    public int weatherId;//记录该区县的天气信息
    public int cityId;//该区县所属的市级代码
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountyName() {
        return countyName;
    }
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public int getCountyCode() {
        return countyCode;
    }
    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }
    public int getWeatherId() {
        return weatherId;
    }
    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
    public int getCityId() {
        return cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

