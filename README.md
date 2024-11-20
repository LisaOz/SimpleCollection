# Simple Collection
This Java program demonstrates a Simple Collection system that allows adding, removing, modifying and printing out items stored within an ArrayList. The ArrayList is a part of the Java Collections Framework that provides a resizable array implementation. ArrayList is used in this program to handle collections of data allowing for dynamic resizing as elements are added or removed.

## Features
1. **Add Item**: Add a new item to the collection as long as it is not null or an empty string.
2. **Remove item**: Remove an item from the collection if it is present.
3. **Replace Item**: Replace the existing item in the collection with the other, if they are not null and not empty strings.
4. **Display Collection**: The toString() method provides a string representation of the collecion, including its mame, the number of items and the list of items.

## Code Overview
### Class SimpleCollection
- This class represents a collection of items
- Each instance of the SimpleCollection is associated with a name and a list to store the items

### Constructor
- Creates a new **SimpleCollection** object with the specified name.
- The parameter **name** specifies the name of the collection.

### Methods
- *add(String item)*: Adds an item to the collection if it is valid (not null and not empty);
- *remove(String item)*: Removes the specified item from the collection if it exists;
- *replace()*: Replaces the existing item in the collection with the new valid item;
- *toString()*: Returns a string representation of the collection, inluding a name, the number of items and the list of items. If the collection is empty, it returns a message indicating about it.

## License
This program is licenced under MIT licence and can be copied and modified in accordance with the terms of the LICENSE.
  

