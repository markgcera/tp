package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_BOOKING_PERIOD_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;

import org.junit.jupiter.api.Test;

import seedu.address.testutil.EditPersonDescriptorBuilder;

public class EditBookingDescriptorTest {

    @Test
    public void equals() {
        // same values -> returns true
        EditCommand.EditRoomDescriptor descriptorWithSameValues = new EditCommand.EditRoomDescriptor(DESC_AMY);
        assertTrue(DESC_AMY.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(DESC_AMY.equals(DESC_AMY));

        // null -> returns false
        assertFalse(DESC_AMY.equals(null));

        // different types -> returns false
        assertFalse(DESC_AMY.equals(5));

        // different values -> returns false
        assertFalse(DESC_AMY.equals(DESC_BOB));

        // different name -> returns false
        EditCommand.EditRoomDescriptor editedAmy = new EditPersonDescriptorBuilder(DESC_AMY)
                .withName(VALID_NAME_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different phone -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withPhone(VALID_PHONE_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different email -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withEmail(VALID_EMAIL_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));

        // different booking period -> returns false
        editedAmy = new EditPersonDescriptorBuilder(DESC_AMY).withBookingPeriod(VALID_BOOKING_PERIOD_BOB).build();
        assertFalse(DESC_AMY.equals(editedAmy));
    }

    @Test
    public void toStringMethod() {
        EditCommand.EditRoomDescriptor editRoomDescriptor = new EditCommand.EditRoomDescriptor();
        String expected = EditCommand.EditRoomDescriptor.class.getCanonicalName() + "{room="
                + editRoomDescriptor.getRoom().orElse(null) + ", booking period="
                + editRoomDescriptor.getBookingPeriod().orElse(null) + ", name="
                + editRoomDescriptor.getName().orElse(null) + ", phone="
                + editRoomDescriptor.getPhone().orElse(null) + ", email="
                + editRoomDescriptor.getEmail().orElse(null) + ", remark="
                + editRoomDescriptor.getRemark().orElse(null) + "}";
        assertEquals(expected, editRoomDescriptor.toString());
    }
}
