// step 1
p<String, String> map = new HashMap<String, String>();
map.put("key1", "value1");
map.put("key2", "value2");
map.put("key3", "value3");

// step 2
for (String key : map.keySet()) {
	System.out.println("key= "+ key + " and value= " + map.get(key));
}

// step 3
Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
while (it.hasNext()) {
	Map.Entry<String, String> entry = it.next();
        System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
}

// step 4
for (Map.Entry<String, String> entry : map.entrySet()) {
	System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
}

// step 5
for (String v : map.values()) {
	System.out.println("value= " + v);
}
