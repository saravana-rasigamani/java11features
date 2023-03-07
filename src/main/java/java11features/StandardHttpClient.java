package java11features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class StandardHttpClient {
	public static void main(String[] args) {
		HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(10)).build();

		HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://google.com")).build();

		HttpResponse<String> response = null;
		try {
			response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		if(response != null) {
			System.out.println("Status code: " + response.statusCode());
			System.out.println("Headers: " + response.headers().allValues("content-type"));
			System.out.println("Body: " + response.body());
		}
		

	}
}
