import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;


public class TestGetToken {
    @Test
    void testToken(){
        RestAssured.given().log().all()
                .queryParam("corpid","ww7b6d8b92c3dc46fd")
                .queryParam("corpsecret","mh3ebKv4OYWSeZrRp3ljDMizFLcSg1Z2R2gcRVw1j58")
                .when().get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then().log().all().statusCode(200).body("errcode",equalTo(0));
    }


}
