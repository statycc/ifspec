# IFSPEC Benchmark suite v1.0

**IFSpec is a collection of micro-benchmarks of information-flow vulnerabilities in Java and Android programs.**

IFSpec benchmarks are provided in three formats: Java source code, Java bytecode and Dalvik bytecode.
The benchmark suite was introduced in ["A Uniform Information-Flow Security Benchmark Suite for Source Code and Bytecode"](https://doi.org/10.1007/978-3-030-03638-6_27)
in 2018 by Tobias Hamann, Mihai Herda, Heiko Mantel, Martin Mohr, David Schneider & Markus Tasch.

## Sample tags and their distribution

| Tag                | Samples | Types of information flow (IF) covered | Explicit flows | Implicit flows |
|:-------------------|:-------:|:---------------------------------------|:--------------:|:--------------:|
| simple             |   18    | simple IF not covered by tags below    |       ✓        |                |
| high-conditional   |   11    | IF via secret-dependent conditionals   |                |       ✓        |
| arrays             |   12    | IF involving array length and content  |       ✓        |       ✓        |
| class-initializers |    7    | IF involving class initializers        |       ✓        |       ✓        |
| exceptions         |   11    | IF via exception handling              |                |       ✓        |
| library            |    7    | IF involving library calls             |       ✓        |       ✓        |
| aliasing           |   11    | IF involving object aliasing           |       ✓        |       ✓        |
| reflection         |    7    | IF involving reflection                |       ✓        |       ✓        |
|                    |         | **TOTAL**                              |     **46**     |     **34**     |                                            

## Repository Content

This repository contains all benchmarks as-is and without modification.
* Directories `JavaSourceCode` and `JavaByteCode` and `DalvikByteCode` contain the benchmark suite in respective target languages.
* In addition, each benchmark includes, e.g., ground truth, description, and sources and sinks.

This repository does not include: 
* The tested tools or scripts to reproduce the results presented in the original paper.
* Files version.txt and security-semantics.txt files were omitted as unnecessary.
* The Extensions benchmarks are omitted, as they only include specific target languages. 

Refer to the [original artifact](https://www.spp-rs3.de/IFSpec) to obtain omitted components if needed.

## Statistics

**Number of benchmarks**

```
$ find JavaSourceCode -mindepth 1 -maxdepth 1 -type d | wc -l
    232
```

**Lines of code**

``` 
$ cloc JavaSourceCode/**/*.java                            

     558 text files.
     248 unique files.                                          
     310 files ignored.

github.com/AlDanial/cloc v 1.96  T=0.84 s (293.7 files/s, 140331.8 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                           248          43636           1388          73484
-------------------------------------------------------------------------------
SUM:                           248          43636           1388          73484
-------------------------------------------------------------------------------
```

This means a benchmarks may contain multiple program files.
Files may be duplicated between secure/insecure benchmark variants.
Statistics calculated with [cloc](https://github.com/AlDanial/cloc).


## Additional Notes

* Information about [RIFL Specification Language](https://publikationen.bibliothek.kit.edu/1000092713)
* SecuriBench benchmarks [modifications notes](adjusted_securibench_micro_classifications.txt) 
* For licensing terms see [LICENSE](LICENSE.md)
 
