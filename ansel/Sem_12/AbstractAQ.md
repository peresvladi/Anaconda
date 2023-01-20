
-) -

<details>
<summary></summary>

```javascript

import pandas as pd
import matplotlib.pyplot as plt
%matplotlib inline
import seaborn as sns

```




</details>



-) -

<details>
<summary></summary>

```javascript

fd = pd.read_csv('3_taxi_peru (1).csv')

```



</details>



-) -

<details>
<summary></summary>

```javascript

fd

```

![pd_read_csv_3_taxi_peru_csv.jpg](pd_read_csv_3_taxi_peru_csv.jpg)

вывод (параметры вывода файла) требуют изменения (дополнения) для корректного вывода

</details>



-) -

<details>
<summary></summary>

```javascript

fd = pd.read_csv('3_taxi_peru (1).csv', sep = ';', parse_dates=['start_at', 'end_at', 'arrived_at'])

```



</details>



-) -

<details>
<summary></summary>

```javascript

fd

```

![read_csv_3_taxi_peru_csv_sep_parse_dates.jpg](read_csv_3_taxi_peru_csv_sep_parse_dates.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

fd.info()

```

![fd_info().jpg](fd_info().jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

fd.dtypes

```

![fd_dtypes.jpg](fd_dtypes.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

fd.source.value_counts(normalize=True).mul(100).round(2)

```

![normalize_mul_round.jpg](normalize_mul_round.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

v_taxi = fd.groupby('source', as_index = False).agg({'user_id':'count'}).sort_values('user_id', ascending =False)\
  .rename(columns = {'user_id' : 'piple'})

```



</details>



-) -

<details>
<summary></summary>

```javascript

v_taxi

```

![groupby_agg_sort_values_rename.jpg](groupby_agg_sort_values_rename.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

sns.barplot(data = v_taxi, x = 'source', y = 'piple')

```

![barplot_data_x_y.jpg](barplot_data_x_y.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

sns.countplot(fd.source)

```

![countplot_source.jpg](countplot_source.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

sns.countplot(fd.end_state)

```

![countplot_end_state.jpg](countplot_end_state.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

plt.figure(figsize=(10,8))

```

![figure_figsize.jpg](figure_figsize.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

dsc = fd.driver_score.value_counts(normalize=True).mul(100).round(2).reset_index()\
        .rename(columns = {'index' : 'driver_score', 'driver_score' : 'percentage'}).sort_values('driver_score')

```



</details>



-) -

<details>
<summary></summary>

```javascript

dsc

```

![driver_score_ren_colum_sort_val.jpg](driver_score_ren_colum_sort_val.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

pl = sns.barplot(data = dsc, x = 'driver_score', y = 'percentage', color='red',alpha = 0.6)

```

![barplot_data_x_y_color_alpha.jpg](barplot_data_x_y_color_alpha.jpg)



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>



-) -

<details>
<summary></summary>

```javascript

-

```

![]()



</details>


