package com.xyz;

import java.util.HashMap;

final class ImmutableClass {
private final Integer id;
private final String name;
private final HashMap<Integer,String> map;
public ImmutableClass(Integer id, String name, HashMap<Integer,String> map){
this.id=id;
this.name=name;
this.map=new HashMap<Integer, String>(map);
}
public Integer getId() {
return id;
}
public String getName() {
return name;
}
public HashMap<Integer, String> getMap() {
return (HashMap<Integer, String>) map.clone();
}
}

public class ImmutableClassTest{

public static void main(String[] args) {
Integer localId= new Integer(1);
String localName=new String("ABCD");
HashMap<Integer, String> localMap = new HashMap<Integer,String>();
localMap.put(11, "audi");
ImmutableClass immutableClass = new ImmutableClass(localId, localName, localMap);
System.out.println("----Display ImmutableClass members before changing----");
System.out.println(immutableClass.getName());
System.out.println(immutableClass.getId());
System.out.println(immutableClass.getMap());
//Comparing ImmutableClass members with local before changing
System.out.println(localName==immutableClass.getName());
System.out.println(localId==immutableClass.getId());
System.out.println(localMap == immutableClass.getMap());
//change local
localId = new Integer(2);
localName = new String("WXYZ");
localMap.put(12, "ferarri");
System.out.println("\n----Display ImmutableClass members after changing----");
System.out.println(immutableClass.getName());
System.out.println(immutableClass.getId());
System.out.println(immutableClass.getMap());
//Comparing ImmutableClass members with local after changing
System.out.println(localName==immutableClass.getName());
System.out.println(localId==immutableClass.getId());
System.out.println(localMap == immutableClass.getMap());
}
}

