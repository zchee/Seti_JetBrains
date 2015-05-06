# 1. Check Java version

```
$ /usr/libexec/java_home
```

result,
```
/Library/Java/JavaVirtualMachines/jdk1.9.0.jdk/Contents/Home
```

Recommendation is `jdk1.8.x.jdk` or `jdk1.9.x.jdk`

# 2. Expand jar

Intellij Idea
> /Applications/IntelliJ\ IDEA\ 14\ EAP.app/Contents/lib/idea.jar

RubyMine  
> /Applications/RubyMine.app/Contents/lib/rubymine.jar

```
$ cd /tmp
$ mkdir ./idea-141.xxx.x # x is IDE version
$ cd ./idea-141.xxx.x
$ jar xf "/Applications/IntelliJ IDEA 14 EAP.app/Contents/lib/idea.jar"
```

# 3. Edit darcula.properties

```
$ find . -name darcula.properties

./com/intellij/ide/ui/laf/darcula/darcula.properties
```

Ok, Let's edit `darcula.properties`.    
Each functions, please refer to the [DEBUG](DEBUG.md)

# 4. Compile jar

Have you finished yet ?  
But, do not know color until compile, try to compile

```
$ jar cf ../idea.jar .
```

# 5. Backup and Replace jar

**Please not forget to backup !!**  
**Please not forget to backup !!**  
**Please not forget to backup !!**

Ok?
```
$ mv /Applications/IntelliJ\ IDEA\ 14\ EAP.app/Contents/lib/idea.jar ../idea-master.jar
$ cp ../idea.jar /Applications/IntelliJ\ IDEA\ 14\ EAP.app/Contents/lib/idea.jar
```

# 6. Launch IDE
Check color balance.  
Done !
