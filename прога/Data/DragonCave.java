package Data;

/** Глубина пещеры дракона
 */
public class DragonCave {
    private Long depth; //Поле может быть null

    public DragonCave(){
    }

    public DragonCave(Long depth){
        this.depth = depth;
    }

    /** возвращает глубину пещеры
     * @return Long
     */
    public Long getDepth(){
        return depth;
    }
}
