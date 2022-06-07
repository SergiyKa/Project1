package lesson4;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class ArrayHome {

    public void stringsArray() {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(weekdays[3]);
    }

    public void integerArray() {
        int[] daysid = {7, 1, 2, 3, 4, 5, 6};
        System.out.println(daysid[3]);
    }

    public void arrayListWeek() {

        ArrayList<String> weekdays = new ArrayList<String>();
        weekdays.add("Sunday");
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");

        System.out.println(weekdays.get(5));
    }

    public void hashMapToystore(String ID){

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("ID12", "Batmobile");
        hashMap.put("ID45", "Light Saber");
        hashMap.put("ID6", "Wonder Woman");
        hashMap.put("ID201", "Hello Kitty Bag");
        hashMap.put("ID56", "Junior QA Analyst Doll");
//        System.out.println(hashMap);

        System.out.println(hashMap.get(ID));
       if(hashMap.get(ID) == null){
        System.out.println("No such Toy");}

    }

    public void arrayListNames(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");

        Collections.sort(names);

        names.remove("Steve");
        names.remove("Tim");
        names.remove("Lucy");

        for (String i: names) {
            System.out.println(i);
        }


    }

    public void hashSetNames(){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Steve");
        hashSet.add("Tim");
        hashSet.add("Lucy");
        hashSet.add("Steve");
        hashSet.add("Pat");
        hashSet.add("Angela");
        hashSet.add("Tom");
        hashSet.add("Tim");
        hashSet.add("Anna");
        hashSet.add("Lucy");
        System.out.println(hashSet);

    }




}
