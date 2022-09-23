# JVM Profilling Memory EN-US

This is a code to test how JVM (Java Virtual Machine) deals with memory, garbage collector and out of memory error using JMC (Java Mission Control)

### How to run using JMC

* You should have installed [JDK 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
* It's not mandatory, but have [JMC](https://docs.oracle.com/javacomponents/jmc-5-5/jmc-user-guide/jmc.htm#JMCCI111) is very nice to see this coding in action

* After install the JMC, open the executable file
<img width="687" alt="jmc2" src="https://user-images.githubusercontent.com/42419543/191968357-fce0d6f1-58f3-4f23-bf2d-50e8b9e02f70.PNG">


* You should see something like this

<img width="957" alt="jmc" src="https://user-images.githubusercontent.com/42419543/191968470-4cd47b4f-3368-473c-bc27-7eefdfc085ca.PNG">

> It's not necessary a plugin inside the IntelliJ IDEA or any IDE that you wnat to use...

* Open the project and run the code

* After run the code, the project should appear on JMC
* * Look how amazing is, you can explore the memory usage and see the garbage collector in action now
<img width="958" alt="jmc3" src="https://user-images.githubusercontent.com/42419543/191968831-e799918b-e76b-43f1-bebd-6a40a47391e4.PNG">

> you should run this project usind the same JDK that you will use the JMC, if you have windows and want to run using WSL it's not gonna works.

I hope this repository helps you!


--------------------------------------------------------------------------------

# Criação de um perfil de memória da JVM PT-BR

Este é um código para testar como JVM (Java Virtual Machine) lida com memória, garbage collector e erro de falta de memória usando JMC (Java Mission Control)

### Como executar usando JMC

* Você deve ter instalado o [JDK 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
* Não é obrigatório, mas ter [JMC](https://docs.oracle.com/javacomponents/jmc-5-5/jmc-user-guide/jmc.htm#JMCCI111) é muito bom ver essa codificação em ação

* Após instalar o JMC, abra o arquivo executável
<img width="687" alt="jmc2" src="https://user-images.githubusercontent.com/42419543/191968357-fce0d6f1-58f3-4f23-bf2d-50e8b9e02f70.PNG">


* Você deve ver algo assim

<img width="957" alt="jmc" src="https://user-images.githubusercontent.com/42419543/191968470-4cd47b4f-3368-473c-bc27-7eefdfc085ca.PNG">

> Não é necessário um plugin do JMC dentro do IntelliJ IDEA ou qualquer IDE que você queira usar...

* Abra o projeto e execute o código

* Após executar o código, o projeto deverá aparecer no JMC
* * Olha que incrível, você pode explorar o uso de memória e ver o coletor de lixo em ação agora
<img width="958" alt="jmc3" src="https://user-images.githubusercontent.com/42419543/191968831-e799918b-e76b-43f1-bebd-6a40a47391e4.PNG">

> você deve rodar este projeto usando o mesmo JDK que vai usar o JMC, se você tem windows e quer rodar usando WSL não vai funcionar.

Espero que este repositório tenha te ajudado!


**Não esqueça de dar um star para ajudar a alcançar mais devs.**

