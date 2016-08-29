package observe;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observe> Observes;
    private float tempterature;
    private float pressure;
    private float humidity;
    
    public WeatherData(){
        Observes = new ArrayList<Observe>();
    }
    
    @Override
    public void notifyObserver() {
        for(int i = 0; i < Observes.size();i++){
            Observe Observe = Observes.get(i);
            Observe.update(tempterature, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(Observe Observe) {
        Observes.add(Observe);
    }

    @Override
    public void removeObserver(Observe Observe) {
        int i = Observes.indexOf(Observe);
        if(i >= 0){
            Observes.remove(i);
        }
    }

    /**
     * ����վ�õ����µĹ۲�����ʱ��֪ͨ�۲���
     */
    public void measurementChanged(){
        notifyObserver();
    }
    
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.tempterature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
