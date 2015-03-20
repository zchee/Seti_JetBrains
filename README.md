Seti_JetBrains
==============

[Seti_UI](https://github.com/ctf0/Seti_ST3) and [Seti_UX](https://github.com/ctf0/Seti_UX) port for JetBrains IDE.  
And Hacking `Darcula` Theme.


# Screenshot
Tentatively

![](https://raw.githubusercontent.com/zchee/Seti_JetBrains/master/screenshot/all.png)


# Environment
## Platform
- Mac
- Windows

## Application
- IntelliJ Idea 14
- RubyMine 141.96
- WebStorm 140.2424
- PhpStorm 8

# Important
You must replace this files or move original files in another folder, in other way ide will use renamed files in lib folders.


# Installation

## Syntax
Move [Seti_JB.icls](syntax/Seti_JB.icls) to

Platform | Folder path
-------- | -----------
Mac | `~/Library/Preferences/IntelliJIdea14/colors` or `~/Library/Preferences/WebIde80/colors`
Windows | `~\JetBrains\.IntelliJIdea14\config\colors` or `~\.WebIde80\config\colors`


## Theme

### IntelliJ Idea
1. Select your platform `idea-xxx.jar` and `icons-xxx.jar`.

2. Rename to `idea.jar` and `icons.jar`.

3. Replace `idea.jar` and `icons.jar` to

Platform | Folder path
-------- | -----------
Mac | `/Applications/IntelliJ Idea 14.app/Contents/lib/`
Windows | `C:\Program Files (x86)\JetBrains\IntelliJ IDEA xxx\lib\`

### PhpStorm
1. Select your platform `phpstorm-xxx.jar` and `icons-xxx.jar`.

2. Rename to `phpstorm.jar` and `icons.jar`.

3. Replace `phpstorm.jar` and `icons.jar` to

Platform | Folder path
-------- | -----------
Mac | `/Applications/PhpStorm.app/Contents/lib/`
Windows | `C:\Program Files (x86)\JetBrains\PhpStorm xxx\lib\`

## Icons
1. Open JetBrains IDE.

2. Open Preferences.

3. `Plugins > Install plugin from disk` click.

4. Choose [Seti_JB-icons.jar](icons/Seti_JB-icons.jar)

## Third party plugins icons
Replace to

### IntelliJ Idea
Platform | Folder path
-------- | -----------
Mac | `/Applications/IntelliJ Idea 14.app/Contents/plugins`
Windows | `C:\Program Files (x86)\JetBrains\IntelliJ IDEA xxx\plugins`

### PhpStorm
Platform | Folder path
-------- | -----------
Mac | `/Applications/PhpStorm.app/Contents/plugins`
Windows | `C:\Program Files (x86)\JetBrains\PhpStorm xxx\plugins`

in [plugins](https://github.com/zchee/Seti_JetBrains/tree/master/plugins)


# Language status
See [STATUS.md](STATUS.md)


# jar Origin application version
## Mac
- IntelliJ Idea 14 (build 14.0.3)
- PhpStorm 8 EAP (build 139.873)

## Windowos
- IntelliJ Idea 14 EAP (build 139.872.1)
- PhpStorm 8.0.2


# CONTRIBUTE
See [CONTRIBUTING.md](https://github.com/zchee/Seti_JetBrains/blob/master/CONTRIBUTING.md)


# Credits

- Theme is Originally by [jesseweed](https://github.com/jesseweed/seti-ui).
- Ported based on [Seti_ST3](https://github.com/ctf0/Seti_ST3) by [ctf0](https://github.com/ctf0/).
