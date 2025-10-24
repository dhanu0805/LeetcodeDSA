public class Codec {
  int num=0;
  Map<String,String>map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        num++;
        String add=Integer.toString(num);
        String ans="http://tinyurl.com/";
        ans=ans+add;
        map.put(ans,longUrl);
        return ans;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));