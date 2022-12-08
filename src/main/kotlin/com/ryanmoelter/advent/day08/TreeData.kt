package com.ryanmoelter.advent.day08

const val treeData = """113003322412033102023303501444545044215232525401341546163452453404402234201151432242402140110220101
332001304022012142421445502213221330453061535265122314201352335233021055055200345412200440033322200
011113132214324432134325045311145402450516101640412524056254134552334050434552541351100000142223210
120100233011423423144030334144351644642605521663331053414601341464201040045104150001214204243212330
032313022420343002352401031112122630544621450306410014210122655033613410314450242104133332033433110
330133431221024552500405304311611205251454505525065601244143364343441153320511500334525320443331122
232021314224321045040222145130205324423110304256225426345644345334310200416004113133521143332200422
312322022143422250013255366221252062135020112327134227764002156152041134323314242255102200014240004
212411010402324310541162616440606266620317315234166112525535542054554446314636025435501101142314410
130420010020500305012262532345565125253527765422533261626735742433241362062404452514044512024131310
241211034142224054050344306633445512263575724527746635663111434536510100261040501431453540340134211
241313213114241230212646636605641533121654131662127125143714342377771455431346140255405303533314030
200214302143123545226333105604234323144236661442633717414531213335635263423430225510502553055320124
432210433113545424321340236152364457166745737761176472274142327714574465315263302246430530531052340
044321111115013046066155407144655275272121513224325736736453741437462322257332111603344504052313220
423214232334431334032453034121465736632235428586864276787383246667147623517713521254056250023050122
341124205512002021001520535463145337475482376656634323542842654415315313467514115356311404235042224
132001402100660310301501776141144746672773424257875288227677277663442356545463514004411150412531212
001052001350350313612735275534436625275423778573334245773528222523563225127612470242660400232440014
000112513501320042013743116251356437388536835723273464367352632733656224242323651012010230151310024
432343513243516355144362617334462875826626872624526547773732534284688857151541627654520220114445210
030155000415201011165562424113226826748747748853864385358746645352362468546644524342115335322112153
521354124325146425431532157187775456325686557739354768338786565328828884835715454276200630310531024
453541003326165663116714725533384334462564846638857736639973473868246353547315725644665433532024310
550412430051564655211263423273445384473677893666497965987545884578247877687261326676604334421513240
413054444206603631433161684337566624388758573363447988796769799695582635658423643315241325425634024
215150330040102563666211553675525355868889739969438648979533595459347577832874756321426443250541325
421424650534663421741533522275548697677937396576933765698789956783468276533784535453223333266121254
422144151564541614312463257866683347483647399747895987469373443743399762878755625665635533442122100
142126413036631514413457664863683937946499766465555784756389698779343558673226534437441452602242233
305201320636671251145832252388563746733774564949748445664654449965453936743822654651524764154313443
011300622102111771164477857675385967936859964787497949987577437799784855267278677674646432241223234
340321113267666756754785648366853336456946997569954774746449465943647534953257556352535151305025463
541411012547643576586448655984493857478575997945994447954587596973768677885376565465523461502535643
444321100654632152854364424757747839747855469574958798776977549543479354379242483435267721134026240
020626205154575316847673866764644374748789977457499575788744688854499953995222366237635424744520350
335506510045711628565868794334457797677874456886875779795697459467453749364727248672726163736041204
500111603536263112863778287468558998649869948858895979757648556554566675849574438477347434571054505
122000100243546685578334388934875844674864976796788677978555975645687865954363424837536471770452415
141414215752566148738527647673948945657599775586897776875597686768689334698832463748744764733053124
100340653262173232623746876388947885855898958859977856795865855466954797947557362275815142426540331
466303032723142355554844869739456445889568997967558595977567767954454556686589744843263767635404425
004613266772514623473428884775998765955988667675865595697667595999549844548767382824562175546612214
223062321176322437826876799485789855749797897795766857786556556466469876653886288833557467773301562
413332261232125275243773533956777794896856665777776697967896558687464977634963578724434267752313063
552404621241274462672869963657657685959857786696669988675856559577744587934439473355436162566631240
435165353647675322378767844955594694568958979668688889986755769858696479453833942343873533447232052
244432367557727222376845574654778567657966566799677789797957677969848457379553465846862364131450331
500160365677454526747395979487899988575755756767767688698968968964795455975647975338665645777505164
102431235675118652565457756594548744578555576979976998997755878856465958937486343448585657465615526
246165542416756587676444776898888956766578897997878779867867799995588485976853457557557151277215635
001643325345324464653748985776747945569696578767779897778688898756644945899654857626437342132540232
012101664761176266736346897839595848575598988867686699987969655574844656549763626542283366457311330
561504075335422826822483989945889874569866596668697889889787698578564685356683642368537236162426203
352203514134651772748288733934776699589795768989986896977876655856647995457449532883535245357460413
033642404423741338448747543456567587875878659898696769778857567974989696766857638532623516361132200
616444206117715325587799743549596679896878996579778797758659755584898985549986338256726477267555103
520455143625244274365846334377848464679657799659996799959789655886895549885388585227864441542440633
301346217675555884462648646383444656479799855995796958569776779656497648598636775768426556776465212
520404231326621664428744458384498945886755796967559979558788575647874897993564426835362551773515204
316242511662326327222423774658467889697656957595795766869586965778777639684376585246752671616104436
415146426112762185773325386754349955694758878879858887885879799994465943455896555866711732413133541
355625411617227324663526785865944884474696755859788678978799585984575877863878686426651623174052622
250022125746424524625262754995697689898769757895898887999798967686567449959582647242127737515510342
525264040416627662865878845844435466984695749789657699584976867495646849545456285287242646554654353
036123646424431555263267827839763498876769495677697448449595455554764947373454763645727333510646146
204566364235641316654753765445963394466448895664985649465498769864394998376778764453573662441355520
220335031661255773663868585338574847865979585777445874888879656858779783486746544464161776603563641
222513656331342447187422756294679343838685457555849784967456454674489536467765228571211235451313300
420041535613636672654268683685394696895377789594449696975655499485443388622338663537334646443120355
525056224212611227113776876877874646779895859895448998785578796984395868862632743546145340000633644
404314430546135313471247434875543567783736878545548779967377554684776373253726223752325712616213051
353422360566111142127744587245868774578548754579967945935667489466386244448265471714226610251556141
240135510612042471674334266253242658953336636546539684393847584358732442564537232411555541300234143
555204024234655515726125842362866243634643845579964798949797638778425653264527614711662106606433551
203524350135524444622315434263233285368993457879757738399643368354787234632745135155274525361620440
340532455653452155645722264385685523579545388464998647475936784423755683487133452753535123313604354
352152244221611331745526617386458872637865488449639856654753583624523335337272114515341203461045505
312033003454166053225452625154365544367483828667456379835556776344278883841652574422331646601235245
354330514213011046317425234714582372762675574834484437275552425744868747672133251365644033361512332
044021444522010141412515121117476227878457643873272338756238823637528547351444752605411146631314215
232413442230001100251223172352214643455635846823657522575345326788747411734266577565251164231145220
131504320306315625216346311325345143883224276853882277427888248757813625336722630560555630113015013
024451223151264563630623162617513241445834482436236846786748364751551471325535132540104323422105400
124420553125506323053405346614111134556285246233525828237347884315614217572766434350535521515101401
130200351112000250166105345316513263244676855323883356633222244252121772667652426014110503513555221
400241412230012102424516231766252561312255446621244373337355416351623124213640652213520151043110444
322440423504102454033133351036544434155137522762124773455775324625526553424524313460144053442544330
324303335402501236440552111053234114555641277255456252443511634243752643304353256666504353255522122
241434204225354100532033205000145461776516534477176114531271372735543451231303326454043352113013420
334124213300015522546105345511323376357312632521613774424256342133105114520414061451141133554301031
211304431150451251125020043053260563634374764226536222654742522421115640025331113215553523303422011
123324243323523142132445503461621106650437431517676417742653314226115466013230223030345414021112341
100121244242050431353422620202033056213213561562676642451361622463016135301034322504250003434240420
202331344430130314251310046312513630614136423111235233115234253411664210435541154434125202004300041
311142442400021052335032430131001522121243633355511015105456130306054020525345400331240114301233431
303333210333101445104545232532514231420245342044224564606555504302423403203123103211431303412444103
322112022033322224210512330414230625446520203533135512231066520423212314402311345154232414213413203
210220340333424334214524143431005502542403323230305103516410534415015522312221415410344021130000212"""
