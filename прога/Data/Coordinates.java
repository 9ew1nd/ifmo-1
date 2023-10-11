package Data;

/** Класс координат дракона
 */
public class Coordinates {
    private double x;
    private Long y; //Максимальное значение поля: 565, Поле не может быть null

    public Coordinates(double x, Long y){
        this.x = x;
        this.y = y;
    }

    /** Возвращает координату X
     * @return double
     */
    public double getX(){
        return x;
    }

    /** Возвращает координату Y
     * @return long
     */
    public Long getY(){
        return y;
    }
}
