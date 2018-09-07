a = 0
t = 0
b = ["Este", "es", "un", "ejemplo", "de", "lenguaje", "interpretado"]
print("Que opción quiere utilizar?")
print("1.Loop")
print("2.Recursion")
print("3.Simple Print")
choice = int(input("Ingrese el número de la opción: "))
def Loop():
	for i in range(len(b)):
		print(b[i])
def Recursion(x):
	if x <= 6:
		print(b[x])
		x = x + 1
		Recursion(x)
def Simple():
	*print(b)
if choice == 1:
	Loop()
elif choice == 2:
	Recursion(t)
elif choice == 3:
	Simple()