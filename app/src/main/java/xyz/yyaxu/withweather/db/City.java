package xyz.yyaxu.withweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    public int id;   //每一个实体类都有一个id
    public String cityName;  //记录市名称
    public int cityCode;   //记录市的代码
    public int provinceCode;  //记录该市的上级省级代码
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

