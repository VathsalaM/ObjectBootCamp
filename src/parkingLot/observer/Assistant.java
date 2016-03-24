package parkingLot.observer;

/*
    Job : to upate the status of summary
 */

public class Assistant implements Observer {

    private int msg;

    @Override
    public void update(int msg) {

        this.msg = msg;
    }


    public String summary(){
        return ""+msg;
    }
}
