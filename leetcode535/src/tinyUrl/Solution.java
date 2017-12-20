package tinyUrl;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	private Map<String, String> encodeMap = new HashMap<>();
	private Map<String, String> decodeMap = new HashMap<>();
	
	public String encode(String longUrl){
		if(encodeMap.get(longUrl) == null){
			String shortUrl = generateUrl(longUrl);
			encodeMap.put(longUrl, shortUrl);
			decodeMap.put(shortUrl, longUrl);
		}
		return encodeMap.get(longUrl);
	}
	
	public String decode(String shortUrl){
		return decodeMap.get(shortUrl);
	}
	
	public String generateUrl(String longUrl){
		return String.valueOf(encodeMap.size());
	}
	
	public static void main(String[] args){
		Solution solu = new Solution();
		System.out.println(solu.encode("https://www.google.com/hk"));
		System.out.println(solu.encode("https://www.google.com"));
	}
}
