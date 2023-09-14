
class Warehouse:
    def __init__(self):
        self.products = {}

    def add_product(self, product_id, name, location):
        if product_id not in self.products:
            self.products[product_id] = {'name': name, 'location': location}
            print("Product added successfully!")
        else:
            print("Product ID already exists.")

    def update_product(self, product_id, name=None, location=None):
        if product_id in self.products:
            if name:
                self.products[product_id]['name'] = name
            if location:
                self.products[product_id]['location'] = location
            print("Product updated successfully!")
        else:
            print("Product ID not found.")

    def view_product(self, product_id):
        if product_id in self.products:
            product = self.products[product_id]
            print("Product ID:", product_id)
            print("Name:", product['name'])
            print("Location:", product['location'])
        else:
            print("Product ID not found.")

def main():
    warehouse = Warehouse()

    while True:
        print("WELCOME TO TIMMY'S WAREHOUSE")
        print("\n1. Add a Product")
        print("2. Update Product")
        print("3. View Product")
        print("4. Exit")

        choice = input("Select an option: ")

        if choice == '1':
            product_id = input("Enter Product ID: ")
            name = input("Enter Product Name: ")
            location = input("Enter Product Location: ")
            warehouse.add_product(product_id, name, location)
        elif choice == '2':
            product_id = input("Enter Product ID to update: ")
            name = input("Enter New Product Name (Leave empty to keep unchanged): ")
            location = input("Enter New Product Location (Leave empty to keep unchanged): ")
            warehouse.update_product(product_id, name, location)
        elif choice == '3':
            product_id = input("Enter Product ID to view: ")
            warehouse.view_product(product_id)
        elif choice == '4':
            print("Exiting Timmy's warehouse")
            break
        else:
            print("Invalid choice. Please select a valid option.")

if __name__ == "__main__":
    main()
