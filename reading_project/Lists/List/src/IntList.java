public class IntList {

    int first;
    IntList rest;
    public IntList(int f ,IntList r){
        first = f;
        rest = r;
    }
    public int size(){
        if(this.rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterativeSize(){
        IntList restIntList = this;
        int count = 0;
        while(restIntList != null){
            count++;
            restIntList = restIntList.rest;
        }
        return count;
    }

    public IntList get(int i){
        if(this ==null){
            return  null;
        }
        if(i == 0){
            return this;
        }
        return this.rest.get(i-1);
    }
}
