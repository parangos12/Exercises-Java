package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		//HASHMAP
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Casillas");
		map.put(3,"Pique");
		map.put(5,"Puyol");
		//Imprimimos el Map con un Iterador

		Iterator it=map.keySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer) it.next();
			System.out.println("Clave: "+key+"-->"+map.get(key));
		}
		
		//TREEMAP
		Map<Integer,String> treeMap=new TreeMap<Integer,String>();
		treeMap.put(1,"Casillas");
		treeMap.put(3,"Pique");
		treeMap.put(5,"Puyol");
		//Imprimimos el Map con un Iterador

		Iterator it1=treeMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer) it1.next();
			System.out.println("Clave: "+key+"-->"+treeMap.get(key));
		}
		
		//lINKEDHASHMAP
		//TREEMAP
		Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();
		linkedHashMap.put(1,"Casillas");
		linkedHashMap.put(3,"Pique");
		linkedHashMap.put(5,"Puyol");
		//Imprimimos el Map con un Iterador

		Iterator it2=linkedHashMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer) it2.next();
			System.out.println("Clave: "+key+"-->"+linkedHashMap.get(key));
		}

	}
	
	
}	
