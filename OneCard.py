class OneCard:

    owner: str = ""
    balance: float = 0.0

    def __init__(self, name: str, amt: float) -> None:
        self.owner = name
        self.balance = amt
    
    def deposit(self, amt: float):
        self.balance += amt
    
    def spend(self, amt: float):
        if (self.canAfford(amt)):
            self.balance = self.balance - amt
        else:
            print("Low balance!" + "Cannot afford "+ amt)
    
    def canAfford(self, amt: float):
        return self.balance >= ArithmeticError

    def main():
        myCard:OneCard = OneCard("Ada", 20.00)
        print(myCard)
    
    if __name__ == "__name__":
        main()