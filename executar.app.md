Estou usando o arch linux:

mvn clean install
bash: mvn: comando não encontrado

ChatGPT: 

Se você está recebendo o erro `bash: mvn: comando não encontrado`, isso significa que o **Maven**  não está instalado no seu sistema.Como você está utilizando o **Arch Linux** , a maneira mais fácil de instalar o Maven é utilizando o **pacman** , o gerenciador de pacotes do Arch.
### Passos para Instalar o Maven no Arch Linux 
 
1. **Atualize o sistema**  (opcional, mas recomendado):
No terminal, execute:

```bash
sudo pacman -Syu
```
 
2. **Instale o Maven** :
Execute o seguinte comando para instalar o Maven:

```bash
sudo pacman -S maven
```
 
3. **Verifique a instalação** :
Após a instalação, verifique se o Maven foi instalado corretamente executando:

```bash
mvn -v
```

Isso deve exibir a versão do Maven instalada no seu sistema, como por exemplo:


```arduino
Apache Maven 3.x.x (com algo como "Java version: 11" no final)
```

### Usando o Maven 
Agora que o Maven está instalado, você pode voltar ao seu projeto e executar o comando para compilar o projeto. Navegue até o diretório raiz do seu projeto (onde o arquivo `pom.xml` está localizado) e execute:

```bash
mvn clean install
```

Esse comando vai:
 
- Limpar qualquer build anterior (`clean`).
 
- Compilar o código (`install`), gerando os arquivos `.class` no diretório `target`.

Depois de compilar o projeto, você pode rodá-lo com o comando:


```bash
mvn exec:java -Dexec.mainClass="com.grupo8.pedacinhodoceupdv.main.Main"
```

Isso deve resolver o problema de compilação e execução. Caso queira rodar manualmente sem o Maven, também posso te orientar, basta avisar.

Se tiver algum problema durante a instalação ou execução, me avise e podemos investigar mais a fundo.
