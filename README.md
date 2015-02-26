MoNoGe
======

What is this project about?
---------------------------

This project provides a Domain-Specific Language for defining metamodel extension.
It also provides a dynamic virtualization mechanism that generates the extended metamodel from the original metamodel and the extension definition

Screencasts
-----------
These screencasts provide a smattering of the capabilities of this project:
* [DSL definition](http://youtu.be/3PPGLxqfLUE)
* [Metamodel extension](http://youtu.be/nU-_vXqKBgM)
* [Model coexistance](https://youtu.be/_U6DlZJCJic)

Plugins
-------
monoge.dsl.* plugins are for the definition of metamodel extension.
fr.inria.atlanmod.emfviews.* plugins are for the virtualization of the extended metamodel.
In the transformation folder, Mel2VirtualLinks is used as a link between both plugins: it converts the extension model generated by monoge.dsl.* into virtual links model needed by fr.inria.atlanmod.emfviews.* in order to carry out the actual extension.

Who is behind this project?
---------------------------
* [Hugo Bruneliere](https://github.com/Hugo-Bruneliere)
* [Jokin Garcia](https://github.com/jokingarcia)