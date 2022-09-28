package YaPe;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    List<RightRebro> rightRebros = new ArrayList<>();
    List<LeftRebro> leftRebros = new ArrayList<>();
    public void addRebro(Rebro rebro, String name){
        if(name.equals("left")){
            leftRebros.add((LeftRebro) rebro);
        }else {
            rightRebros.add((RightRebro) rebro);
        }
    }
}
