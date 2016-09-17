package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * A storage stub for our test cases
 * (so that nothing is actually modified
 * in our system when running tests)
 * 
 * @author Tan Wang Leng
 */
public class StorageStub extends Storage {

    @Override
    public String getPath() {
        return "";
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return new AddressBook();
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // do nothing (as per [LO-DI])
    }
}
