package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Schedule_PageAnam;
import utilities.DBUtils;

import java.util.Map;

public class Schedule_StepDefsAnam {

    Schedule_PageAnam schedule_page = new Schedule_PageAnam();

    String UIRoomName;
    String dBRoomName;
    String query = "select firstname, lastname,name as roomName\n" +
            "    from users\n" +
            "        join conference c on users.id = c.reservator_id\n" +
            "        join room r on c.room_id = r.id\n" +
            "where users.id=86;";
    @When("User navigates to my Schedule page")
    public void user_navigates_to_my_Schedule_page() {

       schedule_page.goToScheduleMy();

    }

    @When("User gets reserved room name from UI reservation info")
    public void user_gets_reserved_room_name_from_UI_reservation_info() {
        schedule_page.reservedBlock.click();
        UIRoomName =  schedule_page.roomName.getText();
        System.out.println("UIRoomName = " + UIRoomName);
    }

    @When("User gets reserved room name from database information")
    public void user_gets_reserved_room_name_from_database_information() {
        Map<String ,Object> dBResultMap = DBUtils.getRowMap(query);
        System.out.println("dBResultMap = " + dBResultMap);

        dBRoomName = (String) dBResultMap.get("roomname");
        System.out.println("dBRoomName = " + dBRoomName);
    }

    @Then("UI room name is same as DB room name")
    public void ui_room_name_is_same_as_DB_room_name() {

        Assert.assertEquals("Failed",dBRoomName,UIRoomName);
    }


}
