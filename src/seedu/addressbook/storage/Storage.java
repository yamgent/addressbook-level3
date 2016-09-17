package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * The Storage abstract class specify what are expected default behaviors of
 * storage objects, regardless of its origin (whether it is from local
 * file-system, or cloud, or HTTP web server, or etc...).
 * 
 * @author Tan Wang Leng
 */
public abstract class Storage {

    /**
     * Get the human readable, addressable path of the storage.
     */
    public abstract String getPath();

    /**
     * Loads an AddressBook from this storage.
     * 
     * Throws StorageOperationException if there are problems reading it.
     */
    public abstract AddressBook load() throws StorageOperationException;

    /**
     * Saves the content of AddressBook into this storage.
     * 
     * Throws StorageOperationException if there are problems saving it.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Signals that some error has occured while trying to convert and
     * read/write data between the application and the storage.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
}
