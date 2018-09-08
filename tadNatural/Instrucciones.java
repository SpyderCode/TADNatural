/*Implemente el TAD Natural con los constructores Cero y Asignar y las operaciones Sucesor, Escero, Igual, Suma, Antecesor, Diferencia, Producto, Menor Divisiónentera, Módulo.
Representación Informal
Si los constructores son Cero  hay que expresar todas las operaciones en función de ellas. Usaremos error para indicar las excepciones. Además, como no hay ambiguedad en la expresión de los elementos no es necesario indicar ecuaciones entre los constructores.
El significado de las operaciones es:
•	Cero. Da el numero natural 0.
•	Asigna. Asigna un valor positivo al número natural.
•	El Sucesor de un número natural es el natural que le sigue en su orden. El sucesor de 2 es el 3.
•	El Antecesor den. El antecesor un número natural es el natural que le precede en el orden. El antecesor del 5 es 4.
•	Suma. Realiza la suma de dos Naturales (2+3=5).
•	Diferencia. Da la diferencia de dos Naturales (3-2=1).
•	Producto. Da el producto de dos Naturales (2*3=6).
•	Escero. Nos indica si un natural es el numero cero.
•	Igual. Nos indica si dos naturales son iguales.
•	DivisiónEntera. Nos dala división entera entre dos naturales. Division entera de 7/3=2
•	Módulo. Nos da el resto o residuo de la división entre 2 numeros naturales. Modulo(7,3)=1.
Representación Formal
TAD Natural (Valores: números enteros positivos con el cero; Operaciones: Cero, Sucesor, Escero, Igual, Suma, Antecesor, Diferencia, Producto, Menor, Divisiónentera, Módulo)
Sintaxis:
•	//*Cero  ->Natural
•	//*Asigna(Natural)->Natural
•	//Sucesor(Natural)->Natural
•	//Escero(Natural)->Boolean
•	//Igual(Natural,Natural)->Boolean
•	//Suma(Natural,Natural)->Natural
•	//Antecesor(Natural)->Natural
•	//Diferencia(Natural,Natural)->Natural
•	//Producto(Natural,Natural)->Natural
•	//Menor(Natural,Natural)->boolean
•	//Divisiónentera(Natural,Natural)->Natural
•	//Módulo(Natural,Natural)->Natural
Semántica: para todo m,n de tipo natural
•	EsCero(Cero) =>True
•	EsCero(Sucesor(n))=>False
•	Igual(Cero,n)=>EsCero(n)
•	Igual(Sucesor(n),Cero)=>False
•	Igual(Sucesor(n),Sucesor(m))=>Igual(n,m)
•	Suma(Cero,n)=>n
•	Suma(Sucesor(m),n)=>Sucesor(Suma(m,n))
•	Antecesor(Cero)=>error
•	Antecesor(Sucesor(n))=>n
•	Diferencia(n,Cero)=>n
•	Diferencia(Cero,Sucesor(n))=>Error
•	Diferencia(Sucesor(m),Sucesor(n))=>Diferencia(m,n)
•	Producto(n,Cero)=>Cero
•	Producto(n,Sucesor(m))=>Suma(n,Producto(n,m))
•	Menor(n,Cero)=>True
•	Menor(Cero,Sucesor(n))=>False
•	Menor(Sucesor(m),Sucesor(n))=>Menor(m,n)
•	Divisiónentera(n,Cero)=>Error
•	Divisiónentera(m,Sucesor(n))=>Si Menor (m,Sucesor(n)) entonces Cero sino Sucesor(DivisiónEntera(Diferencia(m,Sucesor(n)),Sucesor(n)))
•	Modulo(m,Cero)=>Error
•	Modulo(m,Sucesor(n))=>si Menor(m,Sucesor(n)) entonces m sino Modulo(Diferencia(m,Sucesor(n)),Sucesor(n))
*/