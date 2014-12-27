Seti_JetBrains
==============

[Seti_UI](https://github.com/ctf0/Seti_ST3) port for JetBrains IDE.
And Hacking `Darcula` Theme.


## Screenshot
Tentatively

![](https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/screenshot/all.png)


## Enveronment
### Platform
- Mac
- Windows
### Application
- IntelliJ Idea 14
- PhpStorm 8


## jar Origin Application Version
### Mac
- IntelliJ Idea 14 EAP (build 139.872)
- PhpStorm 8 EAP (build 139.873)

### Windwos
- IntelliJ Idea 14 EAP (build 139.872.1)
- PhpStorm 8.0.2


## Installation

### IntelliJ Idea
#### Mac
Rename `idea-mac.jar` to `idea.jar`.

Replace `idea.jar` and `icons.jar` to

```
/Applications/IntelliJ Idea 14.app/Contents/lib/
```

in [IntelliJIdea14/Mac](https://github.com/zchee/Seti_JetBrains/tree/master/IntelliJIdea14/Mac)
#### Windows
Rename `idea-windows.jar` to `idea.jar`.

Replace `idea.jar` and `icons.jar` to

```
C:\Program Files (x86)\JetBrains\IntelliJ IDEA 139.872.1\lib\
```

in [IntelliJIdea14/Windows](https://github.com/zchee/Seti_JetBrains/tree/master/IntelliJIdea14/Windows)

### PhpStorm
#### Mac
Rename `phpstorm-mac.jar` to `idea.jar`.

Replace `phpstorm.jar` and `icons.jar` to

```
/Applications/IntelliJ Idea 14.app/Contents/lib/
```

in [IntelliJIdea14/Mac](https://github.com/zchee/Seti_JetBrains/tree/master/WebIde80/Mac)
#### Windows
Rename `phpstorm-windows.jar` to `idea.jar`.

Replace `idea.jar` and `icons.jar` to

```
C:\Program Files (x86)\JetBrains\PhpStorm 8.0.2\lib\
```

in [IntelliJIdea14/Windows](https://github.com/zchee/Seti_JetBrains/tree/master/WebIde80/Windows)
### Third party plugins
Replace to

#### IntelliJ Idea
- Mac : `/Applications/IntelliJ Idea 14.app/Contents/plugins`
- Windows : `Program Files\JetBrains\IntelliJ IDEA 139.872.1\plugins`

#### PhpStorm
- Mac : `/Applications/PhpStorm.app/Contents/plugins`
- Windows : `Program Files\JetBrains\PhpStorm 8.0.2\plugins`

in [plugins](https://github.com/zchee/Seti_JetBrains/tree/master/plugins)


## Status
| Language/Section | Syntax Supported | Icon Supported | Note |
|---|---|---|---|
Java | No | **Yes** | -
ActionScript | No | No | -
CFML | No | No | -
CoffeeScript | No | **Yes** | -
CSS | *Progress* | **Yes** | -
Gherkin| No | No | -
Groovy | No | No | -
GSP | No | No | -
HAML | No | No | -
HTML | *Progress* | **Yes** | -
Jade | No | No | -
JavaScript | *Progress* | **Yes** | -
JSON | No | No | -
JSP| No | No | -
JSPX | No | No | -
LESS | No | No | -
PHP | No | No | -
Python | No | No | -
Ruby | No | No | -
SASS | *Progress* | **Yes** | -
SCSS | *Progress* | **Yes** | -
Slim | No | No | -
SQL | No | No | -
Stylus | No | No | -
TypeScript | No | No | -
Velocity | No | No | -
XML | No | No | -
Yaml | No | No | -


## TODO
- [x] Remove the gutter color and see how it looks.
- [x] Can't we change the main app theme colors ?
- [ ] The numbers should be in red like the (-1) to make it easier to spot.
- [ ] Give the var a different color other than white to make it more distinguishable.
- [ ] Proceed with the respective icon change


## CONTRIBUTE
See [CONTRIBUTING.md](https://github.com/zchee/Seti_JetBrains/blob/master/CONTRIBUTING.md)


## Credits

- Theme is Originally by [jesseweed](https://github.com/jesseweed/seti-ui).
- Ported based on [Seti_ST3](https://github.com/ctf0/Seti_ST3) by [ctf0](https://github.com/ctf0/).
