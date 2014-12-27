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

## Installation of Seti_JB syntax

Move [Seti_JB.icls](https://github.com/zchee/Seti_JetBrains/blob/master/Seti_JB.icls) to

- Mac : `~/Library/Application Support/IntelliJIdea14/` or `~/Library/Application Support/WebIde80/`
- Windows : `~/.IntelliJIdea14/config/colors` or `~/.WebIde80/config/colors`


## Installation of Seti_JB theme

### IntelliJ Idea
1. Select your platform `idea-xxx.jar` and `icons-xxx.jar` in [IntelliJIdea14](https://github.com/zchee/Seti_JetBrains/tree/master/IntelliJIdea14/).

2. Rename to `idea.jar` and `icons.jar`.

3. Replace `idea.jar` and `icons.jar` to

- Mac : `/Applications/IntelliJ Idea 14.app/Contents/lib/`
- Windows : `C:\Program Files (x86)\JetBrains\IntelliJ IDEA 139.872.1\lib\`

### PhpStorm
1. Select your platform `phpstorm-xxx.jar` and `icons-xxx.jar` in [WebIde80](https://github.com/zchee/Seti_JetBrains/tree/master/WebIde80/).

2. Rename to `phpstorm.jar` and `icons.jar`.

3. Replace `phpstorm.jar` and `icons.jar` to

- Mac : `/Applications/PhpStorm.app/Contents/lib/`
- Windows : `C:\Program Files (x86)\JetBrains\PhpStorm 8.0.2\lib\`

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


## jar Origin Application Version
### Mac
- IntelliJ Idea 14 EAP (build 139.872)
- PhpStorm 8 EAP (build 139.873)

### Windowos
- IntelliJ Idea 14 EAP (build 139.872.1)
- PhpStorm 8.0.2


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
