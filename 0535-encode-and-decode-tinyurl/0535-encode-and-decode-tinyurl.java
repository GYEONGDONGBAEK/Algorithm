import java.util.*;
public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        byte[] urlBytes=longUrl.getBytes();
        String encodedUrl=Base64.getUrlEncoder().withoutPadding().encodeToString(urlBytes);
        return encodedUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        byte[] decodedBytes=Base64.getUrlDecoder().decode(shortUrl);
        String decodedUrl=new String(decodedBytes);
        return decodedUrl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));