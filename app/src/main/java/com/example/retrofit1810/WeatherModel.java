package com.example.retrofit1810;

import java.util.List;

public class WeatherModel {

private List<Weather> weather = null;

private Main main;
private Wind wind;
private Sys sys;
private String name;
private Integer cod;


public List<Weather> getWeather() {
return weather;
}

public void setWeather(List<Weather> weather) {
this.weather = weather;
}


public Main getMain() {
return main;
}

public void setMain(Main main) {
this.main = main;
}
public Wind getWind() {
return wind;
}

public void setWind(Wind wind) {
this.wind = wind;
}

public Sys getSys() {
return sys;
}

public void setSys(Sys sys) {
this.sys = sys;
}


public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getCod() {
return cod;
}

public void setCod(Integer cod) {
this.cod = cod;
}

}