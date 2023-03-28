import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class Basics {
    public static void main(String[] args) {
        RestAssured.baseURI="https://admin.rc.hungerbox.com";
        given().log().all()
                .headers("Content-Type","application/json")
                .headers("Authorization","Bearer hpPaNX7tMztM4x4iXvNguFvJunxtq6")
                .body("{\n" +
                        "    \"name\": \"restqa021\",\n" +
                        "    \"description\": \"restqa021\",\n" +
                        "    \"active\": true,\n" +
                        "    \"type\": \"vendor_checklist\"\n" +
                        "}")
                .when().post("api/v3/dashboard_management/save-tag")
                .then().log().all().assertThat().statusCode(400);
    }
}
