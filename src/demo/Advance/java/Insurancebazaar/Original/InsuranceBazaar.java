package demo.Advance.java.Insurancebazaar.Original;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InsuranceBazaar {
    HashMap<Integer,String> policyMap=new HashMap<>();

    public HashMap<Integer, String> getPolicyMap() {
        return policyMap;
    }

    public void setPolicyMap(HashMap<Integer, String> policyMap) {
        this.policyMap = policyMap;
    }

    public  void addPolicyDetails(int policyId,String policyName){
        policyMap.put(policyId,policyName);
    }
    public ArrayList<Integer> searchBasedOnPolicyType(String policyType){
        ArrayList<Integer> id=new ArrayList<>();
        for(Map.Entry<Integer,String> map : policyMap.entrySet()){
            if(map.getValue().contains(policyType)){
                id.add(map.getKey());
            }
        }
    return id;
    }
}
