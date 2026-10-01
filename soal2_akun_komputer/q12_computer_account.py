# Encapsulates account credentials behind accessor methods so the
# underlying attributes are never read or changed directly.
class Q12ComputerAccount:
    def __init__(self, real_name, user_name, password):
        self._real_name = real_name
        self._user_name = user_name
        self._password = password

    def print_real_name(self):
        print(f"Real Name: {self._real_name}")

    def print_user_name(self):
        print(f"Username: {self._user_name}")

    def print_password(self):
        print(f"Password: {self._password}")

    def change_password(self, new_password):
        self._password = new_password


if __name__ == "__main__":
    real_name = input("Nama asli: ")
    user_name = input("Username: ")
    password = input("Password: ")

    acc = Q12ComputerAccount(real_name, user_name, password)
    acc.print_real_name()
    acc.print_user_name()
    acc.print_password()

    new_password = input("Password baru: ")
    acc.change_password(new_password)
    acc.print_password()
