package FiveMinuteMistery;
import java.util.*;

class V2Radiator {
    V2Radiator(ArrayList list) {
        for(int x= 0; x < 5; x++){
            list.add(new SimUnit("V2Radiator"));
        }
    }
}

class V3Radiator extends V2Radiator{
    V3Radiator(ArrayList lglist) {
        super(lglist);
        for(int g = 0; g < 10; g++){
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}

class RetentionBot {
    RetentionBot(ArrayList rList) {
        rList.add(new SimUnit("Retention"));
    }
}


class SimUnit {
    private String botType;
    SimUnit(String type) {
        botType = type;
        System.out.println(botType);
    }
    int powerUse() {
        if("Retention".equals(botType)){
            return 2;
        } else return 4;
    }
}
