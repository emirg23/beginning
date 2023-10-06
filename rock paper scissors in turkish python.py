seçenekler = ["taş","kağıt","makas"]

import random

print("-TAŞ KAĞIT MAKAS OYUNU BY EMIRG-")

def oyunbitti():
    if(bilgisayarvictories > 2):
        print("oyun bitti, bilgisayar kazandı.")
    elif(oyuncuvictories > 2):
        print("oyun bitti, oyuncu kazandı.")
    else:
        pass


bilgisayarvictories = 0
oyuncuvictories = 0


def skortablosu():
    print("OYUNCU - " + str(oyuncuvictories) + " BİLGİSAYAR - " + str(bilgisayarvictories))

while(int(bilgisayarvictories) < 3):
    while(int(oyuncuvictories) < 3):


        oyuncununeli = input("lütfen 'taş' / 'kağıt' / 'makas' arasından seçim yapınız.")
        
        bilgisayarıneli = random.choice(seçenekler)

        if(oyuncununeli == "taş"):
            if(bilgisayarıneli == "makas"):
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("taş makası kırar. oyuncu kazandı.")
                oyuncuvictories += 1
                skortablosu()
                oyunbitti()
                
    
            elif(bilgisayarıneli == "kağıt"):
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("kağıt taşı sarar. bilgisayar kazandı.")
                bilgisayarvictories += 1
                skortablosu()
                oyunbitti()
                
    
            else:
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("berabere.")
                break
    
        elif(oyuncununeli == "kağıt"):
            if(bilgisayarıneli == "makas"):
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("makas kağıdı keser. bilgisayar kazandı.")
                bilgisayarvictories += 1
                skortablosu()
                oyunbitti()
                


            elif(bilgisayarıneli == "taş"):
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("kağıt taşı sarar. oyuncu kazandı.")
                oyuncuvictories += 1
                skortablosu()
                oyunbitti()
                
        

            else:
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("berabere.")
                break





        elif(oyuncununeli == "makas"):
            if(bilgisayarıneli == "taş"):
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("taş makası kırar. bilgisayar kazandı.")
                bilgisayarvictories += 1
                skortablosu()
                oyunbitti()
                


            elif(bilgisayarıneli == "kağıt"):
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("makas kağıdı keser. oyuncu kazandı.")
                oyuncuvictories += 1
                skortablosu()
                oyunbitti()
                
        

            else:
                print("bilgisayar " + bilgisayarıneli + "'ı seçti")
                print("berabere.")
                break

    
        else:
            pass

#son güncelleme 02/10/2023