# IFSPEC Benchmark suite v1.0

**IFSpec is a collection of micro-benchmarks of <mark>information-flow vulnerabilities</mark> in Java and Android programs.**

IFSpec benchmarks are provided in three formats: Java source code, Java bytecode and Dalvik bytecode.
The benchmark suite was introduced in ["A Uniform Information-Flow Security Benchmark Suite for Source Code and Bytecode"](https://doi.org/10.1007/978-3-030-03638-6_27) 
(2018) by Tobias Hamann, Mihai Herda, Heiko Mantel, Martin Mohr, David Schneider and Markus Tasch.

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
Directories `JavaSourceCode` and `JavaByteCode` and `DalvikByteCode` contain the benchmark suite in respective target languages.
Under these directories, each subdirectory is a benchmark, and the subdirectory name is the benchmark name.

Each benchmark includes files:

* **program** - benchmark source code + a precompiled .jar (for bytecode) + precompiled .dex (for dalvik).
* **analysis-scope** - the analysis scope, e.g., method name, the analyzer should evaluate.
* **description** - human-readble description of the benchmark.
* **faithfulness** - human-readble description of the security requirement.
* **ground-truth** - secure or insecure.
* **requirements** - condition for secure program.
* **rifl** - source/sink specification in [RIFL language][RIFL].
* **tags** - tags applicable to the benchmark.     

This repository does not contain: 
* The tested tools or scripts to reproduce the results presented in the original paper.
* The "Extensions" subdirectory was omitted since it only includes specific target languages.
* Files version.txt and security-semantics.txt files were omitted as unnecessary.

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

* This means a benchmark may contain multiple files.
* Certain files are be duplicated between secure/insecure benchmark variants.   
* The four Deep* benchmarks account for >90% of the lines of code
* The remaining 228 benchmarks are < 200 LOC.

Statistics calculated with [cloc](https://github.com/AlDanial/cloc).


## Additional Notes

* Information about [RIFL Specification Language][RIFL]
* SecuriBench benchmarks [modifications notes](adjusted_securibench_micro_classifications.txt) 
* For licensing terms see [LICENSE](LICENSE.md)
 
[RIFL]: https://publikationen.bibliothek.kit.edu/1000092713
