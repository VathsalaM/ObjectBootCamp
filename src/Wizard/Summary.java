package wizard;

///*
//    Job :
//        add new information to summary
//        render summary
// */
//public class Summary {
//    private ArrayList<HashMap<String, Integer>> summary = new ArrayList<>();
//    private int total = 0;
//
//    public void add(ColourOfBalls colour) {
//        total++;
//        if (summary.size() == 0) {
//            addSum(colour);
//            return;
//        }
//        HashMap<String, Integer> oldBall = summary.get(summary.size() - 1);
//        if (colour.getColourCode() == oldBall.get("colour")) {
//            oldBall.put("value", oldBall.get("value") + 1);
//            return;
//        }
//        addSum(colour);
//    }
//
//    private void addSum(ColourOfBalls colour) {
//        HashMap<String, Integer> newBall = new HashMap<>();
//        newBall.put("colour", colour.getColourCode());
//        newBall.put("value", 1);
//        summary.add(newBall);
//    }
//
//    public String getSummary() {
//        String[] newStr = {"G", "R", "B", "Y"};
//        String complexSummary = "Bag : " + total + " Balls \n";
//        complexSummary += summary.get(0).get("value") + newStr[summary.get(0).get("colour")];
//        for (int i = 1; i < summary.size(); i++) {
//            HashMap<String, Integer> ballInfo = summary.get(i);
//            complexSummary += ", " + ballInfo.get("value") + newStr[ballInfo.get("colour")];
//        }
//        return complexSummary;
//    }
//}
