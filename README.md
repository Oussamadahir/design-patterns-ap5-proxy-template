# Activité Pratique N°5 — Patterns Proxy et Template Method

**Design Patterns** — Master M2 SDIA II-BDCC 2025/2026
**Auteur :** Oussama Dahir

Deux mini-projets Maven indépendants :

## Proxy (cache)
`proxy/` — Le `ProxyCache` mémorise les résultats d'une opération coûteuse (`ServiceImpl.compute`) pour éviter de la recalculer sur les mêmes entrées. Pattern structurel : un objet de substitution contrôle l'accès au service réel.

```bash
cd proxy && mvn compile exec:java -Dexec.mainClass="com.oussamadahir.proxy.Main"
```

## Template Method
`template/` — `Template` définit le squelette d'un algorithme dans `perform(...)`, et délègue les étapes variables (`param1()`, `compute(...)`) à des sous-classes. Pattern comportemental : on fixe l'ordre des étapes, on laisse les sous-classes décider le contenu de chaque étape.

```bash
cd template && mvn compile exec:java -Dexec.mainClass="com.oussamadahir.template.Main"
```
