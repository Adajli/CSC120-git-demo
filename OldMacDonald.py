class OldMacDonald:

    animal:str = ""
    sound:str = ""

    def __init__(self, my_animal:str,my_sound:str):
        self.animal = my_animal
        self.sound = my_sound
    def sing(self):
        #1
        print("Old MacDonald had a farm, E-I-E-I-O")
        #2
        print("And on that farm he ahd a(n)", self.animal, "E-I-E-I-O")
        #3,4
        print("With a(n)", self.sound,self.sound, "here and a(n)",self.sound,self.sound, "there")
        #5
        print("Here a(n)", self.sound, "there a(n)",self.sound,"everywhere a(n)",self.sound, self.sound)
def main():
    animals = ["dog","cat","cow"]
    sounds = ["woof", "meow", "moo"]
    print("All three verses!!!")
    for i in range(3):
        OldMacDonald(animals[i],sounds[i]).sing()
    
   

main()