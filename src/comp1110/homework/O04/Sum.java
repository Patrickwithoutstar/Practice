package comp1110.homework.O04;

import java.util.ArrayList;
import java.util.Collection;

public class Sum extends ArrayList<Integer> {
    int sum;
    {
        int sum = 0;
        for (int i = 0; i < this.size(); i++) {
            sum+=i;
        }

    }
    int sum(){
        return sum;
    }



    @Override
    public boolean add(Integer a){
        sum+=a;
        return super.add(a);
    }

    @Override
    public void add(int index, Integer i){
        super.add(index,i);
        sum+= i;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c){

        for (Integer integer : c) {
            sum+= integer;
        }
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c){
        for (Integer integer : c) {
            sum+= integer;
        }
        return super.addAll(index, c);
    }
}
