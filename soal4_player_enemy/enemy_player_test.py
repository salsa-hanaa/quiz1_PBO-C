from player import Player
from enemy import Enemy

if __name__ == "__main__":
    print("-- Data Hero --")
    hero_name = input("Nama: ")
    hero_health = int(input("Health: "))
    hero_power = int(input("Power: "))
    hero_defense = int(input("Defense: "))

    print("-- Data Musuh --")
    boss_name = input("Nama: ")
    boss_health = int(input("Health: "))
    boss_power = int(input("Power: "))
    boss_defense = int(input("Defense: "))

    hero = Player(hero_name, hero_health, hero_power, hero_defense)
    boss = Enemy(boss_name, boss_health, boss_power, boss_defense)

    hero.attack(boss)
    boss.attack(hero)
