class Weather
{
int temperature ,humidity,pressure;
Weather(int temp ,int hum,int press)
{
temperature =temp;
humidity=hum;
pressure=press;
}
public void mesurmentsChanged()
{
System.out.println("Temperature : "+temperature );
System.out.println("Humidity : "+humidity);
System.out.println("Pressure : "+pressure);
}

public void getTemperature()
{
System.out.println("Temperature : "+temperature);
}
public void getHumidity()
{
System.out.println("Humidity : "+humidity);
}
public void getPressure()
{
System.out.println("Pressure : "+pressure);
}
public void setMesurment(int t ,int h,int p)
{
temperature =t;
humidity=h;
pressure=p;
mesurmentsChanged();
}
}