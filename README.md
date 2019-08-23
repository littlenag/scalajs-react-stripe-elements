react-stripe-elements for scalajs-react
=======================================

Wanting to use react-stripe-elements with ScalaJS and React? Look no further!

This library adapts the [react-stripe-elements](https://www.npmjs.com/package/react-stripe-elements) JavaScript/React components 
for the [scalajs-react](https://github.com/japgolly/scalajs-react) library by japgolly.

# Status
Most of the `react-stripe-elements` components now have a component representation. 
 
Note: some props parameters may be absent. If something is missing, or incorrect, please open an issue, or provide a PR. 

# Version matrix

| scalajs-react-stripe-elements | scalajs-react | react-stripe-elements |
| ----------------------------- | ------------- | --------------------- |
| 0.0.1-SNAPSHOT                |  1.4.1        | 4.0.0                 |

# How to use

Add the library as a dependency:

```
libraryDependencies += "com.github.littlenag" %%% "scalajs-react-stripe-elements" % "0.0.1-SNAPSHOT"
```

You will also need to ensure that react-stripe-elements is available and importable from JavaScript.
