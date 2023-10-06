naziksevinc = "i am glad you wanna play! i am thinking of a number between 0 and 100 and i want you to guess."
dogrucevap = 0

cevap = input("hello! i wanna play a game with you, can we?")

while(dogrucevap == 0):

    if( cevap == "yes"):
        print(naziksevinc)
        dogrucevap = 1

    elif( cevap == "Yes"):
        print(naziksevinc)
        dogrucevap = 1

    elif( cevap == "no"):
        print("okay then, have a good one...")
        dogrucevap = 1
        exit()

    elif( cevap == "No"):
        print("okay then, have a good one...")
        dogrucevap = 1
        exit()

    else:
        print("the answer has to be 'yes' or 'no'.")
        cevap = input()

tahmin = 1
rakamlayaz = 1
import random

aklımdakisayı = random.randint(2, 99)



while(tahmin == 1):
    
    oyuncununsayisi = input()

    if(oyuncununsayisi.isnumeric() == False):
        rakamlayaz = 1

    while(rakamlayaz == 1):
        if(oyuncununsayisi.isnumeric() == False):
            oyuncununsayisi = input("please write it as a number")
        else:
            rakamlayaz = 0

    if(int(oyuncununsayisi) > 100):
        print("i told you that the number is between 0 and 100.")
    
    elif(int(oyuncununsayisi) == 100):
        print("unfortunately 100 is not included.")
    
    elif(int(oyuncununsayisi) == aklımdakisayı):
        print("congratulations. the number is this!")
        tahmin = 0

    elif(int(oyuncununsayisi) < 0):
        print("i told you that the number is between 0 and 100.")
    
    elif(int(oyuncununsayisi) == 0):
        print("unfortunately 0 is not included.")

    elif(int(oyuncununsayisi) > aklımdakisayı):
        print("it's bigger than what i though of")
    
    elif(int(oyuncununsayisi) < aklımdakisayı):
        print("it's less than what i thought of")
    




    #01/10/2023 last update

    
