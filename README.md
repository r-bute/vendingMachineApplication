# vendingMachineApplication
Vending Machine management system
This project contains a simple implementation of a Vending Machine class in Java. The Vending Machine manages various product slots, allows adding products, dispensing products, and displaying available products.

Classes
Product
Represents a product with a name.

Fields
name: The name of the product.
Methods
getName(): Returns the name of the product.
toString(): Returns a string representation of the product.

Slot
Represents a slot in the vending machine holding a product and its quantity.

Fields
product: The product in the slot.
quantity: The quantity of the product in the slot.
Methods
getProduct(): Returns the product in the slot.
setProduct(T product): Sets the product in the slot.
getQuantity(): Returns the quantity of the product in the slot.
setQuantity(int quantity): Sets the quantity of the product in the slot.
decrementQuantity(): Decreases the quantity by 1 if it is greater than 0.
toString(): Returns a string representation of the slot.

VendingMachine
Manages the product slots in the vending machine.

Fields
slots: A map of product codes to slots.
Methods
VendingMachine(): Default constructor that initializes the slots map.
addProduct(String code, Slot slot): Adds a product slot to the vending machine.
dispenseProduct(String code): Dispenses a product if the slot exists and has a quantity greater than 0; otherwise, prints "Product not available" and returns null.
displayProducts(): Displays all available products in the vending machine.


