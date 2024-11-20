package collection;

import java.util.ArrayList;

// The class represents a group of values
public class SimpleCollection {
	private ArrayList<String> collection; // declare collection to store values
	private String name; // name of the collection

	// Constructor
	public SimpleCollection(String name) {
		this.collection = new ArrayList<>(); // initialise an empty collection
		this.name = name; // set the collection's name

	}

	// Method to add an item to the collection
	public void add(String item) {
		if (item != null && !item.isEmpty()) { // check for null and empty strings
			collection.add(item); // Add the valid items to the collection
		}
	}

	// Method to remove items from the collection
	public void remove(String item) {
		if (item != null && !item.isEmpty()) {
			collection.remove(item);
		}
	}

	public void replace(String item, String newItem) {
		if (item != null && newItem != null && collection.contains(item)) {
			// find the index of the item
			int index = collection.indexOf(item);
			// replace the item at the found index with newItem
			collection.set(index, newItem);
		}

	}

	// Override the toString method for printing the collection
	@Override
	public String toString() {
		if (collection.isEmpty()) {
			return "The collection is empty";
		}

		StringBuilder printOutput = new StringBuilder(
				"the collection " + name + " has " + collection.size() + " item(s):\n");
		for (String item : collection) {
			printOutput.append(item).append("\n");
		}
		return printOutput.toString();
	}
}
